# structurapDP
Target is the target interface that the client code expects to interact with.
Adaptee is the class that needs to be adapted.
Adapter is the adapter class that implements the Target interface and holds a reference to the Adaptee.
The Main class acts as the client code that uses the Adapter to make requests, without directly interacting with the Adaptee.
This code demonstrates how the Adapter pattern allows objects with incompatible interfaces to work together by providing a wrapper (the adapter) that converts the interface of one class into another interface that the client expects.
