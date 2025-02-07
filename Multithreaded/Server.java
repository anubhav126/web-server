package Multithreaded;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.function.Consumer;
public class Server {
    public Consumer<Socket> getConsumer(){
        // return new Consumer<Socket>() {
        //     @Override
        //     public void accept(Socket t) {
        //         try{
        //             PrintWriter toClient = new PrintWriter(t.getOutputStream());
        //             toClient.println("Hello from the server");
        //             toClient.close();
        //             t.close();
        //         }
        //         catch(Exception ex){
        //             ex.printStackTrace();
        //         }
        //     }
        // };
        return (clientSocket) -> {
            try{
                PrintWriter toClient = new PrintWriter(clientSocket.getOutputStream());
                toClient.println("Hello from the server");
                toClient.close();
                clientSocket.close();
            }
            catch(Exception ex){
                ex.printStackTrace();
        }};
    }
    public static void main (String[] args) {
        int port = 8010;
        Server server = new Server();
        try {
            ServerSocket serverSocket = new ServerSocket(port); 
            serverSocket.setSoTimeout(10000);
            System.out.println("The server is listening on port " + port);
            while(true) {
                Socket acceptedSocket = serverSocket.accept();
                Thread thread = new Thread(()->server.getConsumer().accept(acceptedSocket));
                thread.start();
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
