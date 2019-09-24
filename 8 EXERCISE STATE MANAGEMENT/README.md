08 Exercises: HTTP Protocol
===========================

---
---

Problems for exercises and homework for the [“Java Web Development Basics”
course \@
SoftUni](https://softuni.bg/trainings/1844/java-web-development-basics-january-2018/internal).
Submit your solutions on the **course page** of the **current instance**.

Extracting Cookies
------------------

You have been tasked to extract the **Cookies** from the **Cookie Header** of a
simple **HTTP Request**. The Request will be given to you as a text. Its
contents are insignificant to the exercise itself, but it is important to know
that the Request might have any header and might or might not have a body.

Extract the **Cookies** from the given Request Data and print their values in
format: **{cookieKey} \<-\> {cookieValue}**

### Example

| **Input**                                                                                                                                                                         | **Output**                                                                                  |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------|
| POST /url HTTP/1.1 <br/> Date: 17/01/2019 <br/> Host: localhost:8000 <br/> Content-Type: application/xml <br/> Cookie: lang=en; Sess=lsn3Xeg2 <br/> name=Yum&quantity=50&price=10 | lang \<-\> en Sess \<-\> lsn3Xeg2                                                           |
| POST /url HTTP/1.1 <br/> Cookie: JSession=c3zdsDDD341v <br/> name=Yum&quantity=50&price=10                                                                                        | JSession \<-\> c3zdsDDD341v                                                                 |
| GET /url HTTP/1.1 <br/> Host: localhost:8000 <br/> Cookie: lang=en; theme=dark; <br/> locale=bg_EN; <br/> JSession=58vzsdfg                                                       | lang \<-\> en <br/> theme \<-\> dark <br/> locale \<-\> bg_EN <br/> JSession \<-\> 58vzsdfg |

Create classes
--------------

Create class – **HttpCookie**.

The **HttpCookie** has the following **properties**:

-   key

-   value

These **properties** are both **Strings** and are passed through the
**constructor**.

Add a **collection** of **HttpCookies** to the **HttpRequest** class from the
previous exercise. **Parse** the **inputs** from **above** into actual
**HttpCookie** implementations in the **HttpRequest**.
<br/>

### Solution: <a title="All Tasks" href="https://github.com/TsvetanNikolov123/JAVA---Java-Web-Development-Basics/tree/master/8%20EXERCISE%20STATE%20MANAGEMENT/src/app">All Tasks</a>

---