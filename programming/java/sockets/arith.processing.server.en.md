## Working with the TCP sockets in Java

* Create 2 apps:

  1. ClientApp will take data from a collection of type Integer with variable size, will open a socket and send the data using either DataOutputStream or ObjectOutputSteam in order to send the collection of integer values to the server and wait for the server response, once the responce was received, the client should display the result in the console
  2. SeverApp will accept client's connection, receive the data either through DataInputStream or ObjectInputSteam, iterate through it, sum all the integers in the received data and send back the resulting sum


NOTE: if you choose to use DataInput(Output)Stream - then you will have to encode/decode the integers as they will be transported as an array of characters,if you choose the ObjectInput(Output)Stream then it will be easier to transfer the data one by one, or you will have to implement your own "container/collection" marked with Serialiazable interface
