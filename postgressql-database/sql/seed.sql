-- books data inserts

insert into bookstore.books (id,isbn,author,publisher,genre,number_of_pages,weight,price,book_type,title) values
    (1,'9781529157840','Tom Hindle','Cornerstone','Fiction','464','319','7.49','Paperback','A Fatal Crossing');


-- reviews data insert

insert into bookstore.reviews (id,isbn, star_rating, review_description) values (1,'9781529157840', '4.3', 'Test description');
insert into bookstore.reviews (id,isbn, star_rating, review_description) values (2,'9781529157840', '4.0', 'Not Duplicate');