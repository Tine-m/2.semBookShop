# 2.semBookShop

App illustrates a basic flow where 
- a book list is displayed in html page
- user clicks on link --> create new book endpoint in @controller
- @Controller create empty book object and forwards to html page
- user enter book data in html form and submits --> new endpoint in @Controller
- @controller delegates saving of new book to service which makes repository do the actually saving
- Repository is simulation of database :-)
