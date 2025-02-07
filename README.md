# Java Socket Programming Examples

Simple demonstration of socket programming in Java with single-threaded and multi-threaded implementations.

## Getting Started

### Prerequisites
- Java 8 or higher
- Available port 8010 on localhost

### Installation
```bash
git clone [repository-url]
cd java-socket-programming
```

### Running the Applications

#### Single-Threaded Version
```bash
# Terminal 1
javac SingleThreaded/Server.java
java SingleThreaded.Server

# Terminal 2
javac SingleThreaded/Client.java
java SingleThreaded.Client
```

#### Multi-Threaded Version
```bash
# Terminal 1
javac Multithreaded/Server.java
java Multithreaded.Server

# Terminal 2
javac Multithreaded/Client.java
java Multithreaded.Client
```

## Implementation Details

### Single-Threaded Version
- Basic one-to-one client-server communication
- Server runs on port 8010
- 10-second socket timeout
- Closes after single connection

### Multi-Threaded Version
- Supports concurrent client connections
- Creates new thread per client
- Client simulates 100 concurrent connections
- Server remains active for multiple connections

## Project Structure
```
.
├── SingleThreaded/
│   ├── Client.java
│   └── Server.java
└── Multithreaded/
    ├── Client.java
    └── Server.java
```

## Features
- Socket timeout handling
- Exception management
- Resource cleanup
- Lambda expressions
- Thread management
- BufferedReader/PrintWriter communication

## License
[Add your license here]

## Contributing
[Add contribution guidelines]
