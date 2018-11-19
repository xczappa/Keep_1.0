INSERT INTO users (email, enabled, password, userName) VALUES ('tomasz.czaplicki@gmail.com', 1,'$2a$10$hL8v660722LpqJh15O1WTO5kBMnYjbjqBIbgDZdTtgLl4CYTBPPE6', 'tomasz');
INSERT INTO users (email, enabled, password, userName) VALUES ('izabelakaminska@gmail.com', 1,'$2a$10$hL8v660722LpqJh15O1WTO5kBMnYjbjqBIbgDZdTtgLl4CYTBPPE6', 'iza');

insert into priorities (title) values ("LOW")
insert into priorities (title) values ("MEDIUM")
insert into priorities (title) values ("HIGH")


insert into categories (title) values ("ZAKUPY")
insert into categories (title) values ("AUTO")


insert into tasks (created, active, text, category_id, priority_id, user_id, deadLine, deadLinee) values ("2018-10-11", 1, "mleko", 1, 3, 1, "2018-11-16", "2018-11-17")
insert into tasks (created, active, text, category_id, priority_id, user_id, deadLine, deadLinee, isPast) values ("2018-11-07", 1, "ser", 1, 2, 2, "2018-11-16", "2018-11-15", true)

insert into tasks (created, active, text, category_id, priority_id, user_id, deadLine, deadLinee, isPast) values ("2018-11-12", 1, "wymiana opon", 2, 1, 1, "2018-11-16", "2018-11-17", true)
insert into tasks (created, active, text, category_id, priority_id, user_id, deadLine, deadLinee) values ("2018-11-06", 1, "myjnia", 2, 3, 2, "2018-11-16", "2018-11-17")
insert into tasks (created, active, text, category_id, priority_id, user_id, deadLine, deadLinee, isPast) values ("2018-11-11", 1, "wymiana radia", 2, 3, 2, "2018-11-16", "2018-11-30", false)


