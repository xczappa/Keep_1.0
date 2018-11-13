INSERT INTO users (email, enabled, password, userName) VALUES ('tomasz.czaplicki@gmail.com', 1,'$2a$10$hL8v660722LpqJh15O1WTO5kBMnYjbjqBIbgDZdTtgLl4CYTBPPE6', 'xczappa');
INSERT INTO users (email, enabled, password, userName) VALUES ('xczappa@gmail.com', 1,'$2a$10$hL8v660722LpqJh15O1WTO5kBMnYjbjqBIbgDZdTtgLl4CYTBPPE6', 'czappa');

insert into priorities (title) values ("defcon 1")
insert into priorities (title) values ("defcon 2")
insert into priorities (title) values ("defcon 3")
insert into priorities (title) values ("defcon 4")
insert into priorities (title) values ("defcon 5")

insert into categories (title) values ("ZAKUPY")
insert into categories (title) values ("NA JUTRO")


insert into tasks (created, active, text, category_id, priority_id, user_id) values ("2018-11-11", 1, "mleko", 1, 3, 1)
insert into tasks (created, active, text, category_id, priority_id, user_id) values ("2018-11-11", 1, "ser", 1, 2, 2)

insert into tasks (created, active, text, category_id, priority_id, user_id) values ("2018-11-11", 1, "sprawdzić skrzynke", 2, 1, 1)
insert into tasks (created, active, text, category_id, priority_id, user_id) values ("2018-11-11", 1, "odebrać pranie z pralni", 2, 5, 2)


