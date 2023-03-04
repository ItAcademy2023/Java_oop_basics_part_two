# Examples

### Inheritance:
1. example of a class that extends a parent class. 
File: [Product.java](src/com/itacademy/eshop/product/Product.java)

### Polymorphism: 
1. example of a method that can accept different types of objects (overloading), removeProduct(...). Class: [Eshop](src/com/itacademy/eshop/shop/Eshop.java)
2. example of a method that is redefined in a child class (overriding), getPrice(). Class: [Computer](src/com/itacademy/eshop/product/Computer.java)
3. example of class that implements interface with method. Interface: [Discountable](src/com/itacademy/eshop/shop/Eshop.java). Class: [Computer](src/com/itacademy/eshop/product/Computer.java)
4. example of Abstract class and abstract method. Abstract Class: [Product](src/com/itacademy/eshop/product/Product.java) Implemented Method: [Computer](src/com/itacademy/eshop/product/Computer.java) displayProductInfo()
### Encapsulation:
1. example of private fields and public methods that access them (getters and setters). Class: [Product](src/com/itacademy/eshop/product/Product.java)
2. Example of encapsulation complexity. getAverageRatting() Class: [Product](src/com/itacademy/eshop/product/Product.java)

### Exceptions: 
1. example of a custom exception that is thrown when a product is not found. 
Exception: [ProductNotFoundException](src/com/itacademy/eshop/exceptions/ProductNotFoundException.java)
Exception thrown: [Eshop](src/com/itacademy/eshop/shop/Eshop.java)
Exception is handled: [CustomerSimulation](src/com/itacademy/eshop/simulation/CustomerSimulation.java)


# Tasks

### Inheritance
1. Create at one or more class per each category that extends the Product class.
2. Create a new subclass of Electronics, such as Smartphone or TV, that inherits from the Electronics class.

### Polymorphism
1. Create a new abstract method in the Product class that will be overridden in the subclasses.
2. Create one more interface and implement it in at least one class.
3. Implement displayProductInfo method in each Product class.
4. Create at least one more case of overloading.
5. Create an abstract class called payment with abstract method processPayment(). Add some fields and methods to it.
6. Create two classes that extend the payment class and implement abstract method.

### Encapsulation
1. Write similar public method to getAverageRating that uses private fields and some logic to return desired output.
2. Modify the Review class based on the encapsulation principles.

### Exceptions
1. Create a new exception class called DuplicateProductException that extends the Exception class.
2. Modify the addProduct() method in the Eshop class to throw a DuplicateProductException if the product being added already exists in the product list.
3. Catch that exception in the Runner class and print a message to the console.