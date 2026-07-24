# 📱 Mobile Management System – OOP Java Application

A console-based Java application built to demonstrate core Object-Oriented Programming (OOP) concepts by managing a phone inventory and filtering smartphones based on customer budget limits.

---

## 📌 Project Overview

This project was developed as part of a university Object-Oriented Programming (OOP) course. It simulates a simple store management workflow where smartphone details are registered, and calculated pricing model logic is applied to find devices matching a user's budget.

### Key Features
* **Custom Price Calculation:** Calculates total price dynamically based on base price, battery capacity, and fixed operational fees.
* **Budget Filtering:** Prompts the user for a budget limit and outputs all available smartphones that fall within that price point.
* **Interactive Console Input:** Dynamically reads phone specs from standard user input.

---

## 💡 Key OOP Concepts Applied

* **Encapsulation:** Used private fields with explicit getter and setter methods across `Phone` and `Smartphone` classes.
* **Inheritance:** Extended the base class (`Phone`) into a specialized class (`Smartphone`) using Java's `extends` keyword.
* **Polymorphism / Method Overriding:** Overrode the `getTotalPrice()` method in `Smartphone` to extend the base pricing logic inherited from `Phone`.
* **Collections Framework:** Managed dynamic lists of objects using Java's `ArrayList`.

---

## 📁 Project Structure

```text
└─ project/
    ├── Phone.java
    ├── Smartphone.java
    └── Project.java // application entry point


📘 Example Functionalities
Create a new smartphone instance:

Java
Smartphone phone = new Smartphone("Apple", "iPhone15", 800.0, 3349, "iOS");
smartphones.add(phone);
Filter smartphones by user budget:

Java
if (phone.getPrice() <= budget) {
    System.out.println("Phone: " + phone.getModel() + ", Total Price: " + phone.getTotalPrice());
}


▶️ How to Run the Project
Open the project in NetBeans, IntelliJ, or any Java IDE.

Ensure the JDK is installed (JDK 8+ recommended).

Run the Project.java file.

The application will prompt you to enter smartphone details and filter them based on your budget.
