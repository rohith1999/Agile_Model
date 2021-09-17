use hr;
select *from employees;
select employee_id,last_name, salary, department_id from employees;
select department_id,location_id from departments;
select last_name,salary, (salary*12)+100 from employees;
select last_name,salary, (salary*12)+100 annaul from employees;
select last_name,job_id,commission_pct from employees;
select last_name,job_id,commission_pct*10 from employees;
select concat(last_name,job_id) "name with id" from employees;
select concat(last_name," works as ",job_id) "name with id" from employees;

select  distinct department_id from employees;

desc employees;

select employee_id,last_name,department_id from employees where department_id  = 90;
select employee_id,last_name,department_id from employees where last_name  = 'Vollman';
select employee_id,last_name,salary,hire_date from employees where hire_date =  '1997-10-10';
select employee_id,last_name,salary,hire_date from employees where date_format(hire_date,"%Y") =  '1997';
select employee_id,last_name,salary,date_format(hire_date, "%W %D %M %Y") hire_date from employees;
select employee_id, last_name, salary from employees where salary <=8000;
select employee_id, last_name, salary from employees where salary between 2500 and 3500;

select employee_id, last_name, salary,manager_id from employees where manager_id in (100,101,201);

select first_name from employees where first_name like's%';
select last_name from employees where last_name like'_o%';
select last_name from employees where last_name like'_op%';

select last_name from employees where manager_id is null;

select employee_id,last_name,job_id, salary from employees where (salary>=5000) AND (job_id LIKE '%MAN');

select last_name,job_id,salary from employees where ((job_id = 'SA_REP') OR (job_id = 'AD_PRES')) and (salary>15000);

select last_name,job_id,salary from employees order by salary;
select last_name,job_id,salary from employees order by salary desc;
select employee_id, upper(last_name) from employees where last_name = 'higgins';

select concat("hello","world");
select substr("hello world",1,5);
select length("hello world",1,5);
select instr("hello world","w");
select substr('hello world', 4);
select lpad(salary,10,'*') from employees;

select max(salary) from employees;
select min(salary) from employees;
select avg(salary) from employees;
select count(employee_id) from employees;
select sum(salary) from employees;

select min(hire_date),max(hire_date) from employees where department_id = 50;

select last_name, instr(last_name,'a') "position of a" from employees;
select count(*) from employees where department_id = 50;
select max(salary) from employees where job_id like '%REP%';

select employee_id,commission_pct from employees where commission_pct is not null;
select count(commission_pct>0) from employees; 
select count(*) from employees;

show columns from employees;

select count(distinct department_id) from employees;
select avg(commission_pct) from employees;
select sum(commission_pct)/count(*) from employees;

-- salary for a particular department
select department_id, sum(salary) from employees group by department_id;
select department_id, avg(salary), max(salary), min(salary), sum(salary), avg(salary) from employees group by department_id;
-- except 10,20,30
select department_id, avg(salary), max(salary), min(salary), sum(salary), avg(salary) from employees
 where department_id >40
 group by department_id;
 
 --  reverse order
 select department_id, avg(salary), max(salary), min(salary), sum(salary), avg(salary) from employees
 group by department_id order by department_id desc;

select count(distinct department_id) from employees;

select department_id,manager_id ,count(last_name) from employees group by manager_id;

-- avg salary of dept > 5000
select department_id, avg(salary) from employees  group by department_id having avg(salary)>8000;
-- max salary of dept
select department_id, max(salary) from employees  group by department_id having max(salary)>10000;

-- find the total salary paid for all the employees expcept for the representatives
select job_id,sum(salary) from  employees where job_id not like "%REP%" group by job_id;

-- find the total salary paid for all the employees expcept for the representatives with salary > 12k
select job_id,sum(salary) from  employees where job_id not like "%REP%" group by job_id having sum(salary)>=12000;

-- find the total salary paid for all the employees expcept for the representatives with salary > 12k sort in desc order
select job_id,sum(salary) from  employees where job_id not like "%REP%" group by job_id having sum(salary)>=12000
order by sum(salary) desc;


-- nesting group functions
select avg(salary) avgsal from employees group by department_id;

select avg(avgsal), max(avgsal) from (select avg(salary)
 avgsal from employees group by department_id) emp;
 
 
 -- find everyone's salery greater than ernst salery
 select last_name,salary from employees where salary > 
 (select salary from employees where last_name = "ernst");
 
 
 
 -- details of employees same jobid as ernt and sal> sal of taylor
 select employee_id, last_name, job_id from employees where job_id=
(select job_id from employees where last_name='ernst')
 AND salary> (select salary from employees where last_name = 'popp');
 
 select employee_id, last_name , salary from employees where salary < ANY(select salary from
 employees where job_id = 'IT_PROG');

  select employee_id, last_name , salary from employees where salary < ALL(select salary from
 employees where job_id = 'IT_PROG');
 
select current_timestamp();
select curdate();
select curtime();

select dayofmonth(current_timestamp());
select dayofweek(current_timestamp());
select dayofyear(current_timestamp());
use hr;
select employee_id,last_name,hire_date,date_format(hire_date,"%b") from employees where  hire_date>'1996-01-31'; 
select employee_id,first_name,last_name from employees where first_name like "s%" and last_name like "%r";
select employee_id, first_name from employees where()
 
 
 
 
 
 
 
 
 
 
 
--  create table
create table Student (
StudentID int,
FirstName varchar(255),
LastName varchar(255),
Address varchar(255)
 );
 desc Student;
 drop table Student;
 desc Student;
 
 select hire_date from employees where date_format(hire_date,"%b") = "feb";
 
 
 



 
 
 
 
 
 
 
 
 
 
 
 
 




















