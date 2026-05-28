/* 35. TCP Client-Server Chat
• Objective: Use Java sockets for TCP communication.
• Task: Implement a simple TCP chat system.
• Instructions:
o Create a ServerSocket that listens for connections.
o Accept client connections and use InputStream and OutputStream for two-way communication.
o Run server and client in different terminals. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class TCPClientServerChat {

    public static void main(String[] args) {

        try {

            ServerSocket serverSocket = new ServerSocket(5000);

            System.out.println("Server waiting for connection...");

            Socket socket = serverSocket.accept();

            System.out.println("Client connected.");

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            String message = input.readLine();

            System.out.println("Client: " + message);

            output.println("Hello from Server");

            socket.close();

            serverSocket.close();

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }
    }
}