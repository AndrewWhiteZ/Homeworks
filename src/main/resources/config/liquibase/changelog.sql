CREATE TABLE TODO_LIST (
    id SERIAL PRIMARY KEY,
    title TEXT NOT NULL
);

CREATE TYPE CATEGORY AS ENUM ('NONE', 'CHORES', 'WORK', 'STUDY', 'INVESTMENTS');

CREATE TABLE TODO_EVENT (
    id SERIAL PRIMARY KEY,
    title TEXT NOT NULL,
    category CATEGORY,
    expiry_date TIMESTAMP NOT NULL,
    todolist_id SERIAL NOT NULL,
    CONSTRAINT fk_todolist
        FOREIGN KEY (todolist_id)
            REFERENCES todo_list(id)
);