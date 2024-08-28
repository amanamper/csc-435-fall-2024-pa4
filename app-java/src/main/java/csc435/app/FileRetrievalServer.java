package csc435.app;

public class FileRetrievalServer
{
    public static void main( String[] args )
    {
        int serverPort = 1;

        // TO-DO initialize the number of worker threads from args[0]

        IndexStore store = new IndexStore();
        ServerSideEngine engine = new ServerSideEngine(store);
        ServerAppInterface appInterface = new ServerAppInterface(engine);
        
        // create a thread that creates and server TCP/IP socket and listenes to connections
        engine.initialize(serverPort);

        // read commands from the user
        appInterface.readCommands();
    }
}
