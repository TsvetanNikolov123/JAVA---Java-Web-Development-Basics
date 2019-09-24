12 Exercises: Java EE: Servlet API
==================================

---
---

Problems for exercises and homework for the [“Java Web Development Basics”
course \@ SoftUni](https://softuni.bg/courses/java-web-development-basics).
Submit your solutions on the **course page** of the **current instance**.

We will implement a simple application, only with Servlets, exploring the most
interesting exploits of the Servlet API.

Chushka Application
===================

Chishka is an application in which you create products, with several properties.
It has many versions, and you will most probably see it several times.

You will have to create a simple multi-Servlet application which has several
pages and 1 object entity.

1.Data
------

This is the data layer of the application. There is 1 data object for you to
implement.

So let’s create our **Product**. The **Product** is a data object which stores
data about an abstract **product**. You will see later what it will be used for.

First implement a class **Product** – which has these properties:

-   **Name** – a **String**.

-   **Description** – a **String**.

-   **Type** – can be one of the following values – (“**Food**”, “**Domestic**”,
    “**Health**”, “**Cosmetic**”, “**Other**”)

| Products    |                        |                     |                                |
|-------------|------------------------|---------------------|--------------------------------|
| Field       | 1                      | 2                   | 3                              |
| Name        | Chushkopek             | Injektoplqktor      | Plumbus                        |
| Description | A universal tool for … | Dunno what this is… | A domestic tool for everything |
| Type        | Domestic               | Cosmetic            | Food                           |

2.Views
-------

In this application you must create several views, similar to the pictures
below:

index.html
----------

This is the home page, in other words the page that should be visualized when
the application starts.

The index page must contain a button that redirect to **create-product.html**
and **list all products names**. Upon clicking a **name** of a **Product**, you
should be **redirected** to a **details page**, with **query parameter** – the
**name** of the **Product**.

<kbd><img src="https://user-images.githubusercontent.com/32310938/65545222-99ddb400-df1d-11e9-8693-f6a03b2984b8.png" alt="alt text" width="900" height=""></kbd>

<kbd><img src="https://user-images.githubusercontent.com/32310938/65545226-9c400e00-df1d-11e9-9d08-b75218cf2617.png" alt="alt text" width="900" height=""></kbd>

create-product.html
-------------------

This is the page where you create your products. It must contain **input** field
for **name**, **textarea** for **description**, field for **selecting** the
product’s **type**, **button** which creates a **Product** with the given values
and a **link** that returns the **home** page.

<kbd><img src="https://user-images.githubusercontent.com/32310938/65545232-9f3afe80-df1d-11e9-9b70-42680011deef.png" alt="alt text" width="900" height=""></kbd>

details-product.html
--------------------

This is the page which **renders full data** about the **selected Product**. The
selected **Product** should be extracted from the **database**, using the
**name** from the **query parameters**.

<kbd><img src="https://user-images.githubusercontent.com/32310938/65545235-a19d5880-df1d-11e9-9ce3-57efd394becd.png" alt="alt text" width="900" height=""></kbd>

3.Servlets
----------

Product Create
--------------

Implement a **Servlet** – **ProductCreateServlet**, which listens on route
“**/products/create**”.

Upon a **GET** request, it should return a form which accepts **3 inputs** – a
**name**, a **description** and a **type**.  
**NOTE**: You should only be able to submit “**Food**”, “**Domestic**”,
“**Health**”, “**Cosmetic**”, “**Other**” as values for the **type**.

The **form** should send a **POST** request to the **same route**.

Upon a **POST** request, you should **redirect** to “**/products/all**”.

Product All
-----------

Implement a **Servlet** – **ProductAllServlet**, which listens on route
“**/products/all**”.

Upon a **GET** request, the **Servlet** should render a page with the **names**
of all created **Products**. Upon clicking a **name** of a **Product**, you
should be **redirected** to a “**/products/details**”, with **query parameter**
– the **name** of the **Product**.

Product Details
---------------

Implement a **Servlet** – **ProductDetailsServlet**, which listens on route
“**/products/details**”.

Upon a **GET** request, the **Servlet** should extract the **Product** with the
given **name** in the **query parameters**, and render a page with **full
information** about it.

4.Constraints
-------------

You must use the following things while implementing your application:

-   Servlets

-   Hibernate

-   Repository layer

-   Service layer

-   Web layer
<br/>

### Solution: <a title="Chushka Application" href="https://github.com/TsvetanNikolov123/JAVA---Java-Web-Development-Basics/tree/master/12%20EXERCISE%20JAVA%20EE%20SERVLET%20API%204.0/ChushkaApplication">Chushka Application</a>

---