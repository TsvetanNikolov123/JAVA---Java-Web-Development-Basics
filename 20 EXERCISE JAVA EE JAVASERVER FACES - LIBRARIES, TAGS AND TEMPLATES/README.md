20 Exercises: JSF – Libraries, tags and templates
=================================================

---
---

Problems for exercises and homework for the [“Java Web Development Basics”
course \@ SoftUni](https://softuni.bg/courses/java-web-development-basics).
Submit your solutions on the **course page** of the **current instance**.

Let’s exercise a little the knowledge we’ve accumulated during the lesson for
JSF.

Fluffy Duffy Munchkin Cats v2(FDMC)
===================================

Remember Fluffy Duffy Munchkin Cats? If you do – good, if you don’t... Well FDMC
is an application in which you register cats, with several properties. It has
previous versions, but now is the time to create it more beatiful.

You will have to create a simple application which has several pages and 1
object entity. You will be provided with some resources like styles but you must
implement the views, so they become similar to the pictures. Note that there are
some requirements that you must check very carefully.

1.Requirements
--------------

The application requirements are:

-   JSF **Facelets** tags

-   JSF **Basic** tags

-   JSF **Convertor** tags

-   JSF **Validator** tags

-   JSF **DataTable**

2.Data
------

This is the data layer of the application. There is 1 data object for you to
implement.

### Cat

Create a **Cat** class, which holds the following properties:

-   **name** – a **String,** must contain at least 2 characters, shouldn’t be
    longer than 10.

-   **breed** – a **String,** must contain at least 5 characters, shouldn’t be
    longer than 20.

-   **color** – a **String**.

-   **age** – an **Integer**, must be between 1 and 31**.**

-   **gender** – a **String**.

-   **price** – a **decimal** value, must be at least 0.01.

-   **addedOn** – a **date** without time.

-   **hasPassport** – a **boolean** value.

**NOTE**: You must validate you cat fields everywhere it is possible, in other
words – on front-end and back-end.

3.Home Page
-----------

The home page must look like this

<kbd><img src="https://user-images.githubusercontent.com/32310938/65548500-458a0280-df24-11e9-9419-e0fa4892cf29.png" alt="alt text" width="600" height=""></kbd>

There are **2 links** on the navbar, which must lead to the following **jsf**:

Create Cat – “**/jsf/cat-create.xhtml**”

All Cats – “**/jsf/all-cats.xhtml**”

4.Cat Create Page
-----------------

Implement a **page**, with form, looking like this:

<kbd><img src="https://user-images.githubusercontent.com/32310938/65548512-4884f300-df24-11e9-91b0-178a2a735243.png" alt="alt text" width="600" height=""></kbd>

**NOTE**: For the field “Added On” you can use PrimeFaces calendar

5.All Cats Page
---------------

<kbd><img src="https://user-images.githubusercontent.com/32310938/65548524-4ae74d00-df24-11e9-93e7-a5fd3879a13e.png" alt="alt text" width="600" height=""></kbd>

It must contain table with all cats.

6.Bonus
-------

On the all cats page you can create functionality that sorts the data in the
table.
<br/>

### Solution: <a title="Fluffy Duffy Munchkin Cats v2(FDMC)" href="https://github.com/TsvetanNikolov123/JAVA---Java-Web-Development-Basics/tree/master/20%20EXERCISE%20JAVA%20EE%20JAVASERVER%20FACES%20-%20LIBRARIES%2C%20TAGS%20AND%20TEMPLATES/Fluffy%20Duffy%20Munchkin%20Cats%20v2/fdmcv2">Fluffy Duffy Munchkin Cats v2(FDMC)</a>

---