create table worker (
    primary key id serial unique,
    first_name varchar(50),
    last_name varchar(50),
    salary integer,
    join_date timestamp,
    department varchar(10) -- Should be a forgin key to another table
);

create table bonus (
    worker_id integer,
    bonus_date timestamp,
    amount integer,
    constraint fk_worker
        foreign key(worker_id)
            references worker(id)
);

create table title (
    worker_id integer,
    title varchar(50),
    affected_from timestamp,
    constraint fk_worker
        foreign key(worker_id)
            references worker(id)
);

-- A
select first_name, last_name from worker where salary >= 50000 and salary <= 10000;
-- B
select department, count(department) from worker group by department order by count(department) desc;
-- C
select * from worker inner join bonus on worker.id = bonus.worker_id inner join title on worker.id = title.worker_id;
-- D
select salary from worker order by salary offset 4 rows fetch next 1 rows only;