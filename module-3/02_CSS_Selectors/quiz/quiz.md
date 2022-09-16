1. According to the *Box Model*, what is the **total** space taken up on the screen (in pixels) of the element defined with this CSS?

```css
    {
        width: 30px;
        height: 42px;
        padding: 10px;
        margin: 15px 5px;
        border: 3px solid black;
    }
```

a. Width: `30px`; Height: `42px`
b. Width: `60px`; Height: `92px`
c. Width: `48px`; Height: `70px`
d. Width: `66px`; Height: `98px` *

**Correct**:
  d. You'd need to double the pixel counts for padding, margin, and border, taking width versus height on the margin into account. Then, add that number to width/height.
**Wrong**:
  a. The question asked for space taken up on the screen, not width and height.
  b. This answer doesn't include the border.
  c. This answer doesn't include the doubled padding, margin, or border pixel counts.

2. Given the following HTML:

```html
  <article id="today">
    <header class="title">
        <h3>Today</h3>
    </header>
    <section>
      <p>Lorem ipsum dolor.</p>
      <p>Sunt, in reiciendis.</p>
      <p>Voluptas, <span>nobis</span>, facere.</p>
      <a href="#" target="_blank">Click here</a>
    </section>
    <p>Not this one</p>
  </article>
```

Which CSS selector selects the `<span>` element?

a. `article header section p span`
b. `article section > span`
c. `.span`
d. `section > p > span` *

**Correct**:
  d. This uses child selectors to select the path and then `<span>`.
**Wrong**:
  a. `<section>` isn't inside `<header>`.
  b. `<span>` isn't a child of `<section>`.
  c. `<span>` isn't a class. This is a class selector.

3. Given the following HTML:

```html
  <article id="today">
    <header class="title">
        <h3>Today</h3>
    </header>
    <section>
      <p>Lorem ipsum dolor.</p>
      <p>Sunt, in reiciendis.</p>
      <p>Voluptas, <span>nobis</span>, facere.</p>
      <a href="#" target="_blank">Click here</a>
    </section>
    <p>Not this one</p>
  </article>
```

How would you use an element selector for the same span?

a. `.span`
b. `#span`
c. `span` *
d. `p.span`

**Correct**:
  c. You'd use the element selector, as there is only one span.
**Wrong**:
  a. `<span>` isn't a class. This is a class selector.
  b. `<span>` isn't an ID. This is an ID selector.
  d. `<span>` isn't a class. This is a class selector.

4. Given the following HTML:

```html
  <article id="today">
    <header class="title">
        <h3>Today</h3>
    </header>
    <section>
      <p>Lorem ipsum dolor.</p>
      <p>Sunt, in reiciendis.</p>
      <p>Voluptas, <span>nobis</span>, facere.</p>
      <a href="#" target="_blank">Click here</a>
    </section>
    <p>Not this one</p>
  </article>
```

Which CSS Selector selects every anchor tag on the page that has a `target` attribute?

a. `a[target]` *
b. `a.target`
c. `#target`
d. `a > target`

**Correct**:
  a. This selector uses square brackets correctly.
**Wrong**:
  b. This selects an `<a>` with a class of `target`.
  c. This selects an element with an ID of `target`.
  d. This attempts to select an element type, `target`, which is a child of an `<a>`.

5. Given the following HTML:

```html
  <article id="today">
    <header class="title">
        <h3>Today</h3>
    </header>
    <section>
      <p>Lorem ipsum dolor.</p>
      <p>Sunt, in reiciendis.</p>
      <p>Voluptas, <span>nobis</span>, facere.</p>
      <a href="#" target="_blank">Click here</a>
    </section>
    <p>Not this one</p>
  </article>
```

The background color of each `<p>` tag inside the `<section>` should turn red when the mouse rolls over it. What CSS Selector would you use?

a.
```css
p:mouseover {
  background-color: red;
}
```
b. *
```css
section > p:hover {
  background-color: red;
}
```
c.
```css
section > p {
  background-color: red;
}
```

d.
```css
article > p:hover {
  background-color: red;
}
```

**Correct**:
  b. This answer uses the `:hover` pseudo-class correctly.
**Wrong**:
  a. There's no `mouseover` pseudo-class.
  c. This assigns a background color without regard to mouse.
  d. Wrong selector; `<p>` is not a child of `<article>`.


6. Given the following HTML:

```html
  <article id="today">
    <header class="title">
        <h3>Today</h3>
    </header>
    <section>
      <p>Lorem ipsum dolor.</p>
      <p>Sunt, in reiciendis.</p>
      <p>Voluptas, <span>nobis</span>, facere.</p>
      <a href="#" target="_blank">Click here</a>
    </section>
    <p>Not this one</p>
  </article>
```

Which elements are inline-level elements?

a. `article`, `header`, `section`, `p`, `span`, `a`
b. `span` *
c. `p`
d. `article`,`header`

**Correct**:
  b. `<span>` elements are inline by default.
**Wrong**:
  a. This answer contains a mixture of inline and block-level elements.
  c. `<p>` is a block-level element.
  d. These are both block-level elements.


