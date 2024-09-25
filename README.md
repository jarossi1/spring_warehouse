# Warehouse Inventory Management

## Overview

This practice application, built with Spring Boot and Thymeleaf, aims to enhance my understanding of web development. It serves as a simple inventory management system for adding, updating, and viewing warehouse items.

## Features

- **Add and Update Items**: Submit new or update existing items via a user-friendly form.
- **Dynamic Inventory View**: View all items in real-time.
- **Success Messaging**: Receive confirmation after submitting items.

## Technologies Used

- **Spring Boot**: Back-end service and business logic.
- **Thymeleaf**: Server-side rendering for dynamic HTML.
- **Java**: Primary programming language.
- **HTML/CSS**: Front-end structure and styling.

## Recent Updates

Date: 09/25/2024
- **Added**: Spring Boot Starter Validation dependency for enhanced form validation.
- **Implemented**: @NotNull for category and date, and @NotBlank for name and price.
- **Updated**: WarehouseController to validate the category and show appropriate error messages.
- **Enhanced**: forms.html with th:if and th:errors for improved user feedback on validation errors.