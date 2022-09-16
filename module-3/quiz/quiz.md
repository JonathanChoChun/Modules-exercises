1. Which of the following is the correct closing tag for `<head>`?

  a. `<head/>`
  b. `</head>` *
  c. `<body>`
  d. `<neck>`

  Correct:
    b. This is the correct syntax for a closing tag.
  Wrong:
    a. This is the syntax for a self-closing tag. `<head>` isn't a self-closing tag.
    c. The tag name isn't correct.
    d. `<neck>` isn't an HTML element.

2. Which of the following are examples of semantic HTML elements? (select all that apply)

  a. `<header>` *
  b. `<div>`
  c. `<footer>` *
  d. `<main>` *
  e. `<span>`
  f. `<form>` *
  g. `<table>` *

  Correct:
    a. Correct. This element means a "header" section.
    c. Correct. This element means a "footer" section.
    d. Correct. This element means a "main" section.
    f. Correct. This element means a "form."
    g. Correct. This element means a "table" section.
  Wrong:
    b. A "div" isn't a semantic element.
    e. A "span" isn't a semantic element.

3. Which example below shows usage of an attribute?

  a. `<p>Foo</p>`
  b. `font-size: 20px;`
  c. `<input type="text">` *
  d. `<br />`

  Correct:
    c. Correct. The `type="text"` part is an attribute.
  Wrong:
    a. This doesn't show any attributes being used.
    b. This is a CSS declaration.
    d. This is a self-closing tag.

4. Which of the following is the correct HTML to create a hyperlink?

  a. `<a href="https://www.example.com">` *
  b. `<a link="https://www.example.com">`
  c. `<link href="https://www.example.com">`
  d. `<a>https://www.example.com</a>`

  Correct:
    a. This is the correct syntax to create a hyperlink.
  Wrong:
    b. `link` isn't the correct attribute.
    c. `<link>` isn't the correct element.
    d. The `<a>` element needs an attribute for the URL. The text you want displayed for the link goes between the `<a>` and `</a>`.

5. What CSS property can you use to make text bold?

  a. `strong`
  b. `em`
  c. `font-weight` *
  d. `font-bold`

  Correct:
    c. This is the correct CSS property.
  Wrong:
    a. This is the HTML tag you'd use to make text bold.
    b. This is the HTML tag you'd use to make text italic.
    d. There's no `font-bold` CSS property.

6. What do the characters in a CSS color hexadecimal string represent—for example, `402dce`?

  a. Red, Green, Blue *
  b. Cyan, Magenta, Yellow
  c. Blue, Green, Red
  d. Rose, Gold, Blue

  Correct:
    a. Red, Green, and Blue are the correct colors represented in a CSS hexadecimal string.
  Wrong:
    b., c., d. These aren't the right colors.

7. True or false. You can specify more than one font in a `font-family` CSS declaration.

  a. True *
  b. False

  Correct:
    a. Correct. In fact, you should specify more than one font in case a user doesn't have the first font in the declaration.
  Wrong:
    b. You can and should specify more than one font in case a user doesn't have the first font in the declaration.

8. Which of the following forms sends a username and password to an API located at `http://localhost:3000/login`?

    a.
    ```html
    <form method="http://localhost:3000/login">
      <label for="username">Username:</label>
      <input type="text" id="username" name="username"/>
      <label for="password">Password:</label>
      <input type="password" id="password" name="password"/>
    </form>
    ```
    b.
    ```html
    <form action="http://localhost:3000/login" method="POST">
      <label for="username">Username:</label>
      <input type="text" id="username" name="username"/>
      <label for="password">Password:</label>
      <input type="password" id="password" name="password"/>
    </form>
    ``` *
    c.
    ```html
    <form url="http://localhost:3000/login">
      <label for="username">Username:</label>
      <input type="text" id="username" name="username"/>
      <label for="password">Password:</label>
      <input type="password" id="password" name="password"/>
    </form>
    ```
    d.
    ```html
    <form url="http://localhost:3000/login" method="POST">
      <label for="username">Username:</label>
      <input type="text" id="username" name="username"/>
      <label for="password">Password:</label>
      <input type="password" id="password" name="password"/>
    </form>
    ```

    Correct:
      b. The `action` attribute of a form is where the data is sent to. The `method` attribute
      tells the form to send the content in a `POST` request.
    Wrong:
      a. The `method` attribute doesn't specify where the data is sent to. It specifies how to send the form data.
      c. `url` isn't a valid attribute of the form tag.
      d. `url` isn't a valid attribute of the form tag.

9. Which of the following sets the document's page title?

    a.
    ```html
    <head>
      <page-title>My Page Title</page-title>
    </head>
    ```
    b.
    ```html
    <body>
      <title>My Page Title</title>
    </body>
    ```
    c.
    ```html
    <head>
      <title>My Page Title</title>
    </head>
    ``` *
    d.
    ```html
    <head>
      <page>My Page Title</page>
    </head>
    ```

    Correct:
      c. The `title` element belongs in `head`.
    Wrong:
      a. The element `page-title` isn't valid.
      b. The `title` element doesn't belong in `body`. It belongs in `head`.
      d. The element `page` isn't valid.

10. Which semantic HTML element represents a stand-alone document within a page?

    a. `<header>`
    b. `<article>` *
    c. `<footer>`
    d. `<aside>`

    Correct:
      b. `<article>` represents a stand-alone document within a page. For instance, a forum post, a
      magazine or newspaper article, or a blog entry are all examples of stand-alone documents within a page.
    Wrong:
      a. The HTML `<header>` element is a container for other items.
      c. The HTML `<footer>` element is the counterpart to the `<header>` tag.
      d. The HTML `<aside>` tag defines a portion of a page which is only indirectly related to the main content.

11. Which of the following includes a style sheet named `styles.css` located in a directory named `css`?

    a. `<a link="css/styles.css">Stylesheet</a>`
    b. `<a href="css/styles.css">Stylesheet</a>`
    c. `<link rel="stylesheet" stylesheet="css/styles.css"/>`
    d. `<link rel="stylesheet" href="css/styles.css"/>` *

    Correct:
      d. You use the `link` tag with the attribute `href` pointing to the style sheet.
    Wrong:
      a,b. You don't use the anchor tag to link to a style sheet.
      c. There's no `stylesheet` attribute for the `link` tag.

