04 Exercise: Web Fundamentals Introduction – Beer Store
=======================================================

---
---

This document defines the **slightly harder exercise** assignments for the "Java
Web Development Basics" course \@ Software University.

Structure Overview
------------------

Your task is to create the design for a beer store. Firstly, you need to create
the following folders:

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539066-5ed58380-df11-11e9-8389-2bb3eb3d559e.png" alt="alt text" width="500" height=""></kbd>

We won’t create different CSS files for each page. Instead, all the styling will
be in a single file – **style.css**, which you will put in the **/style**
folder. In the provided resources file you will find several photos. Put them in
the **/images** folder.

Designing a Reusable Template
-----------------------------

In this chapter, you will design a template, or in other words, a base HTML
structure which you will use for the rest of the pages. If you follow every step
correctly, you should end up with something that looks a bit like this.

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539096-68f78200-df11-11e9-9854-563805b7d252.png" alt="alt text" width="600" height=""></kbd>

Create a file called **template.html**. In it, write the code from the picture
below.

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539176-92181280-df11-11e9-9074-35d0f3e48e4a.png" alt="alt text" width="600" height=""></kbd>

Let’s start with the footer, since it’s the easiest to code. As you can see in
the first screenshot, there is a straight line right across the bottom. You can
make such a line with the **\<hr/\>** tag.

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539199-9cd2a780-df11-11e9-83bc-e71d11e2e237.png" alt="alt text" width="500" height=""></kbd>

Now it’s time to code the hardest part – the navigation bar. We will use a
**\<div\>** to store the links in it and we will style it with CSS. To
manipulate it with our **style.css** file, we need to give it an appropriate
class name. In our case, we will name the class **topnav**. If you look in your
**/images** folder you will see a photo **logo.png**. We need to turn this page
into a clickable link. To do that, we put the **\<img/\>** inside of the
**\<a\>** tag like in the photo below.

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539234-b247d180-df11-11e9-89f2-1185f9baf5fc.png" alt="alt text" width="600" height=""></kbd>

That’s enough HTML for now. Time to go to our CSS file. The first thing we need
to do is change the font. Let’s face it, Times New Roman looks ugly in websites.
So, we will use Calibri. Also, we need to change the background color so that it
isn’t just plain white. Open the **style.css** file and, in it, write the
following code:

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539318-e0c5ac80-df11-11e9-9664-52acbed95c1a.png" alt="alt text" width="400" height=""></kbd>

Now, your page should look something a bit like this:

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539344-e91de780-df11-11e9-88aa-73bdc01cc231.png" alt="alt text" width="600" height=""></kbd>

But the navigation bar still looks far from complete – we must style it a bit
more and we should change the alignment of some of the links. We added the
**topnav** class to the bar some time ago. Now it’s time to put it to use. Add
the following code to our styling file:

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539391-02269880-df12-11e9-94d5-a4ac623b883c.png" alt="alt text" width="500" height=""></kbd>

We also need to style the links, but only the ones that are within an element
with the **topnav** class. The syntax of styling elements nested within other
elements is: **“.class_name element_name”**.

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539407-0bb00080-df12-11e9-94e2-82b97c46bd7d.png" alt="alt text" width="400" height=""></kbd>

When it comes to links, the **text-decoration** property tells whether the link
should be underlined or not. Until now, your template should look something like
this:

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539451-22eeee00-df12-11e9-9d20-a4b7bcb78979.png" alt="alt text" width="600" height=""></kbd>

Here we see our first problem – the logo pushes the navigation bar down and
messes up the alignment. There are two ways out. The first one is to mess around
with the sizes of the image, but that will distort it and it won’t look good.
The other way around is to remove the padding around the logo and give it a tiny
padding on the top so that it is centered:

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539477-2e421980-df12-11e9-8782-185eade70542.png" alt="alt text" width="200" height=""></kbd>

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539548-4fa30580-df12-11e9-9f37-e7eca40ce910.png" alt="alt text" width="700" height=""></kbd>

Now, if everything is all right, your navigation bar should look a bit nicer:

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539556-56ca1380-df12-11e9-9a5b-68ed083f32b0.png" alt="alt text" width="600" height=""></kbd>

If you look at the image from the very beginning of the chapter, you will see
that the “Register” and “Log in” buttons are aligned to the right. Element
alignment is done with the **float** CSS attribute.

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539574-5e89b800-df12-11e9-8f63-94c953c8384a.png" alt="alt text" width="200" height=""></kbd>

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539585-65b0c600-df12-11e9-8e6c-d089890cf277.png" alt="alt text" width="500" height=""></kbd>

If you try and hover with the mouse over any of the links, you will see that
nothing happens. This gives no feedback to the user and makes the navigation bar
feel dull. We are going to change it. In CSS, you can add styling to elements
based on what happens with them (on click, on hover with mouse, etc.) These are
called **pseudo-class selectors**. The syntax of them is:
**“element_name:pseudoclass_selector”**.

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539610-72cdb500-df12-11e9-821b-2fa319588e29.png" alt="alt text" width="300" height=""></kbd>

Now if you load up the template, you will see the two links are properly aligned
and when you place your mouse over a link, it changes its color:

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539632-78c39600-df12-11e9-934f-f0b2ceaf7399.png" alt="alt text" width="600" height=""></kbd>

Finally, if you take one last look at the first photo, you will see that the
page you are currently on has a different color than the rest, so that the user
can know on which page he is. We can do this with one last CSS class.

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539667-8f69ed00-df12-11e9-8270-8d18c2fe7c56.png" alt="alt text" width="400" height=""></kbd>

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539692-9db80900-df12-11e9-8f73-1873bd1f9ad4.png" alt="alt text" width="400" height=""></kbd>

Save everything, add some test text inside of the **\<main\>** tag and enjoy
your template!

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539732-b1fc0600-df12-11e9-95df-6bf68fe6dcea.png" alt="alt text" width="600" height=""></kbd>

For the remaining tasks, you will copy and paste the template you just wrote.

Index Page
----------

The index page won’t be anything too complicated. Just one heading:

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539749-b88a7d80-df12-11e9-9faa-2b39ad2bdd36.png" alt="alt text" width="600" height=""></kbd>

Hint: Use **\<span\>** for the “Beers” segment of the heading. Also, make the
heading bigger:

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539767-c3451280-df12-11e9-995c-b8b4c4f0aec7.png" alt="alt text" width="300" height=""></kbd>

Register Page
-------------

Your next task will be to make a register page that looks something like this:

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539796-cb04b700-df12-11e9-92b7-f86e648d2381.png" alt="alt text" width="500" height=""></kbd>

If you look in the provided resources file you will find a CSS file called
**form.css**. It contains the styling for the form we will code. Add it to the
**/style** folder and reference it in the **register.html** file.

We need to change the active link on the navigation bar. One element can have
more than one class attached to it. The syntax is: **“class1 class2”**.

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539824-dd7ef080-df12-11e9-8862-32b2b3ae4251.png" alt="alt text" width="700" height=""></kbd>

You will notice that everything is centered. That’s because everything is put
inside a **\<center\>** tag:

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539841-e4a5fe80-df12-11e9-872f-c441d489cbd3.png" alt="alt text" width="300" height=""></kbd>

Now it’s time to code the form itself. As you can see, there is descriptive text
above each of the input fields. No that’s not a paragraph. That’s a label.
Labels are used only within forms and are defined with the **\<label\>** tag.

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539859-eb347600-df12-11e9-801a-b9a2665d6d5f.png" alt="alt text" width="600" height=""></kbd>

Hint: Use **\<input\>** tags with appropriate **type** attributes and
**\<label\>**.

Login Page
----------

Next up, you need to style a login page.

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539872-f091c080-df12-11e9-93fc-175b03c5edd0.png" alt="alt text" width="500" height=""></kbd>

The process is the same as with the register page – reference the **form.css**
file, change the active page in the navigation bar, center everything, make a
form with all the appropriate labels and input types.

All Beers List
--------------

We need to make a page where the user can see all the available beers:

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539894-f687a180-df12-11e9-947f-91b97ae80043.png" alt="alt text" width="500" height=""></kbd>

We are going to use, you guessed it, a table. It will contain 4 columns and 5
rows. The first row will be a header and the other 4 rows will be for data. You
should be able to do this without additional help from images.

We first need to change the active link. You should probably know how to do it
by now. We need to span the table across the entire page, give it a border and,
most importantly, remove the default 1-pixel border around the table elements.

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539903-fdaeaf80-df12-11e9-8892-422b05c65ed5.png" alt="alt text" width="400" height=""></kbd>

We also need to style the header cells and the data cells themselves. Since we
have 4 columns, each column should take a quarter of the table. Since the header
and data cells share some of the CSS, we can put it in a different block to
avoid repetition:

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539917-03a49080-df13-11e9-8b8d-ac2aaea8c488.png" alt="alt text" width="300" height=""></kbd>

By default, table data is centred. We want it to be aligned to the bottom of the
cell. To do that, we use the **vertical-align** property:

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539926-07d0ae00-df13-11e9-8606-8d562647f7ea.png" alt="alt text" width="300" height=""></kbd>

As for the header, all we need to do is a simple recolor:

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539936-0ef7bc00-df13-11e9-9f86-135a87636817.png" alt="alt text" width="300" height=""></kbd>

Now it’s time to seed our data in the table. In the first row (the header) add 4
**\<th\>** tags and write the following:

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539946-15863380-df13-11e9-88e6-1639dcf44c0d.png" alt="alt text" width="300" height=""></kbd>

The remaining 4 rows will have the following information inside them:

1.  An image of the beer itself

2.  The brand of the beer and its quantity

3.  A short description (backstory, facts, etc.)

4.  The price of the beer

The only thing we’ve provided is the images themselves. As for the rest – open
Wikipedia or just use your imagination. The general concept is:

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539958-1a4ae780-df13-11e9-85a7-8dbfbff218cf.png" alt="alt text" width="700" height=""></kbd>

Now, we come across a big (literally) problem. The provided images have quite
big sizes:

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539961-1e770500-df13-11e9-8ebb-4ecdc5cdef5d.png" alt="alt text" width="500" height=""></kbd>

We need to fix this. One clever way is to set a constant width to the image and
let the height change proportionally to the width:

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539973-2767d680-df13-11e9-8ea2-073e108506e2.png" alt="alt text" width="200" height=""></kbd>

And, lastly, if you look at the photo from the beginning of the chapter, you
will see that there is a “zebra” pattern on the table. Doing this with a single
CSS class and copy-pasting it over and over gets hideous and, if there are new
entries to the table, you must add the class manually. Remember those
pseudo-class selectors we talked about earlier? They can be used to help us for
this. The **“:nth-child(even/odd)”** is the selector we need:

<kbd><img src="https://user-images.githubusercontent.com/32310938/65539987-2df64e00-df13-11e9-87f8-06ce2a8dbbd0.png" alt="alt text" width="300" height=""></kbd>

Now everything should be set and this page should be complete:

<kbd><img src="https://user-images.githubusercontent.com/32310938/65540006-38184c80-df13-11e9-8380-7aa1a6cbab1e.png" alt="alt text" width="500" height=""></kbd>

Order Page
----------

Finally, we need to style a page from which the user can order his beers:

<kbd><img src="https://user-images.githubusercontent.com/32310938/65540015-3c446a00-df13-11e9-9d0b-f0a0057e2c95.png" alt="alt text" width="500" height=""></kbd>

If this looks like what we have done before, that’s because we will use the same
**form.css** file we used for the login and register pages.

The process is pretty much the same – we will use a **\<center\>** tag, a
heading on the top, and, of course, the form itself.

For the brand selection and the destination, we will use a dropdown list
(**\<select\>** and **\<option\>** tags). This should be pretty
straight-forward, but we also need to add a placeholder option which is just for
description and should not be selected. Luckily, HTML has the solution we are
looking for (we won’t need to write CSS). We can tell an option to be selected,
yet disabled. This means that that option will be displayed to the user, but
once a different selection is made, you cannot get back to it.

<kbd><img src="https://user-images.githubusercontent.com/32310938/65540027-41a1b480-df13-11e9-8fd4-a2bafe6b260f.png" alt="alt text" width="600" height=""></kbd>

<kbd><img src="https://user-images.githubusercontent.com/32310938/65540031-46feff00-df13-11e9-8450-4ed31a42fd77.png" alt="alt text" width="300" height=""></kbd>

For the quantity, we’ll use a number input type. However, the input type doesn’t
have default restrictions for when the user to stop increasing the number. This
means that the user can order a thousand beers from our store. The **min** and
**max** attributes can help us for this.

<kbd><img src="https://user-images.githubusercontent.com/32310938/65540042-4bc3b300-df13-11e9-85e6-57b52d9aa7e9.png" alt="alt text" width="500" height=""></kbd>

Repeat the same process for a while ago for the destination dropdown list. For
the birth date we will use, you guessed it, a date input type. No special
styling needed. Same thing about the text area. Finally, add a submit input type
on the bottom and you should be all set with your beer store template!

<br/>

### Solution: <a title="Beer Store" href="https://github.com/TsvetanNikolov123/JAVA---Java-Web-Development-Basics/tree/master/4%20EXERCISE%20WEB%20FUNDAMENTALS%20INTRODUCTION/Beer%20Store">Beer Store</a>

---