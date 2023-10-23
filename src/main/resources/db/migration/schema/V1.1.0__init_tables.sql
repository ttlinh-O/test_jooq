CREATE TABLE author (
  id INT NOT NULL,
  first_name VARCHAR(50),
  last_name VARCHAR(50) NOT NULL,
  date_of_birth DATE,
  year_of_birth INT,
  address VARCHAR(50),

  CONSTRAINT pk_author PRIMARY KEY (ID)
);

CREATE TABLE book (
  id INT NOT NULL,
  author_id INT NOT NULL,
  title VARCHAR(400) NOT NULL,

  CONSTRAINT pk_book PRIMARY KEY (id),
  CONSTRAINT fk_book_author_id FOREIGN KEY (author_id) REFERENCES author(id)
);


INSERT INTO author VALUES (1, 'George', 'Orwell', '1903-06-25', 1903, null);
INSERT INTO author VALUES (2, 'Paulo', 'Coelho', '1947-08-24', 1947, null);

INSERT INTO book VALUES (1, 1, '1984');
INSERT INTO book VALUES (2, 1, 'Animal Farm');
INSERT INTO book VALUES (3, 2, 'O Alquimista');
INSERT INTO book VALUES (4, 2, 'Brida');