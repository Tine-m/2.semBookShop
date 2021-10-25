# 2.semBookShop

App illustrates a basic flow where 
- a book list is displayed in html page
- user clicks on link --> Http Get command -->  /create endpoint in @Controller
- @Controller creates empty book object, adds object to Model and forwards to html page
- User enters book data in html form and submits --> Http Post command -->  endpoint /addToList in @Controller
- @controller has @ModelAttribute (book) as parameter in endpoint method and delegates saving of new book to service which makes the repository do the actually saving
- Repository is simulation of database :-)
