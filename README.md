# Ecommerce
## Description
Ecommerce is a robust and scalable e-commerce platform built using Java Spring Boot, MySQL, and Microservices architecture. It is designed to provide a seamless shopping experience for users while allowing businesses to manage their products, orders, and customers efficiently.   
## Features
### 1. User Management
1. Registration: Allow new users to create an account using their email or social media profiles.
2. Login: Users should be able to securely log in using their credentials.
3. Profile Management: Users should have the ability to view and modify their profile details.
4. Password Reset: Users must have the option to reset their password through a secure link.
### 2. Product Catalog
1. Browsing: Users should be able to browse products by different categories.
2. Product Details: Detailed product pages with product images, descriptions,
specifications, and other relevant information.
3. Search: Users must be able to search for products using keywords.
### 3. Cart & Checkout
1. Add to Cart: Users should be able to add products to their cart.
2. Cart Review: View selected items in the cart with price, quantity, and total details.
3. Checkout: Seamless process to finalize the purchase, including specifying delivery address and payment method.
### 4. Order Management
1. Order Confirmation: After making a purchase, users should receive a confirmation with
order details.
2. Order History: Users should be able to view their past orders.
3. Order Tracking: Provide users with a way to track their order's delivery status.
### 5. Payment Integration
1. Multiple Payment Options: Support for credit/debit cards, online banking, and other popular payment methods.
2. Secure Transactions: Ensure user trust by facilitating secure payment transactions.
3. Payment Receipt: Provide users with a receipt after a successful payment.
### 6. Authentication
1. Secure Authentication: Ensure that user data remains private and secure during login and throughout their session.
2. Session Management: Users should remain logged in for a specified duration or until they decide to log out.
## Technologies Used
- Java Spring Boot
- MySQL
- Docker
- Kubernetes
- RESTful APIs
- Kafka for Event Streaming
- Swagger for API Documentation
## Installation
1. Clone the repository:
   ```bash 
   git clone https://github.com/pardeepchahal89/ScalerCapstone.git
2. Navigate to the project directory:
   ```bash 
   cd ScalerCapstone
3. Set up MySQL database and update the application.properties file with your database credentials.
4. Build the project using Maven:
   ```bash 
   mvn clean install
5. Run the application:
   ```bash 
   mvn spring-boot:run
## Usage
- Access the application at `http://localhost:8080`
- Use the provided RESTful APIs to interact with the platform.
- Refer to the Swagger documentation at `http://localhost:8080/swagger-ui.html` for detailed API usage.
## Contributing
We welcome contributions from the community! To contribute:
1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Commit your changes and push to your forked repository.
4. Submit a pull request for review.
5. Ensure your code follows the project's coding standards and includes appropriate tests.
## License
This project is licensed under the MIT License. See the LICENSE file for details.
## Contact Information
For any questions or inquiries, please contact:
- Name: Pardeep Chahal
- Email: pardeepchahal89@gmail.com
- Phone: +91-9728696062
- GitHub: https://github.com/pardeepchahal89
- LinkedIn: https://www.linkedin.com/in/pardeep-chahal/