18 Exercises: JavaServer Faces
==============================

---
---

Problems for exercises and homework for the [“Java Web Development Basics”
course \@
SoftUni](https://softuni.bg/trainings/1844/java-web-development-basics-january-2018/internal).
Submit your solutions on the **course page** of the **current instance**.

18.01 Employee Register
-----------------------

You have been tasked to create a simple page using JSF, for a big company. The
page should support displaying, creating and deleting data about employees. The
page should also present aggregated data in the form of sums and averages.

Start by creating the **Employee** class. It should have the following
properties:

-   **First Name**

-   **Last Name**

-   **Position**

-   **Salary**

-   **Age**

### Displaying Employees

Add some employees from the code (in a static collection or just any way you
want) and display them like this.

<kbd><img src="https://user-images.githubusercontent.com/32310938/65548064-62720600-df23-11e9-814b-f6ba43fb88ea.png" alt="alt text" width="900" height=""></kbd>

**NOTE**: Use the **given HTML** resources to construct the JSF exactly like the
screenshot above.

### Deleting Employees

Implement functionality for **removing employees**. By clicking on the
[**Remove**] button, the corresponding employee should be **deleted** .

### Creating Employees

Creating Employees is simple. Implement a form on the page (again, using the
given HTML resources), for Employee creation. It should have fields for **First
Name**, **Last Name**, **Position**, **Salary** and **Age**.

The **Salary** and **Age** should be **number-type** inputs.

You don’t need an additional page. Everything from this task will be done on
this page.

The form should look like this:

<kbd><img src="https://user-images.githubusercontent.com/32310938/65548072-6736ba00-df23-11e9-9e0b-94d283d40bcc.png" alt="alt text" width="900" height=""></kbd>

**Submitting** the **form** (clicking on the [**Register**] button) should
**initialize** an **Employee object,** with the data from the **input fields**.
If there is an **empty field**, **NOTHING** should happen, and **NO** Employee
should be added.

### Aggregating Employees

Finally, implement a simple aggregated data about the **Total Salary** needed to
pay all **Employees**, and the **Average Employee Salary** given.

This data should depend only on the existent **Employees**. **Deleted
Employees** do **not figurate** in this data.

It should look like this:

<kbd><img src="https://user-images.githubusercontent.com/32310938/65548082-6aca4100-df23-11e9-8015-1003f46502df.png" alt="alt text" width="900" height=""></kbd>

### Expected Result

Now, if you have implemented everything correctly, you should have a fully
functional Employee Register Page, which looks like this:

<kbd><img src="https://user-images.githubusercontent.com/32310938/65548086-6e5dc800-df23-11e9-949c-500ae3bb716a.png" alt="alt text" width="900" height=""></kbd>
<br/>

### Solution: <a title="Employee Register" href="https://github.com/TsvetanNikolov123/JAVA---Java-Web-Development-Basics/tree/master/18%20EXERCISE%20JAVA%20EE%20JAVASERVER%20FACES/Employee%20Register/EmployeeRegisterApp">Employee Register</a>

---