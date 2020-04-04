DELIMITER //

create procedure QuickEntry(
	in pemp_no int(11), 
	in fullname varchar(15) 
	
)
Begin
	DECLARE EXIT HANDLER FOR 1062
    BEGIN
     SELECT CONCAT('Duplicate key (',pemp_no,') occurred') AS message;
    END;

	insert into employees(emp_no, birth_date, first_name, last_name, gender, hire_date)
	values(pemp_no, curdate(), fullname, 'UPDATE', 'M', curdate());

	select * from employees where emp_no = pemp_no;

end //

Delimiter ;

delimiter //

create procedure DeleteMultiple(
	in pemp_no int(11),
	in amount int(11)
)
Begin
	Declare idDelete int default 0;
	Declare theCounter INT default 0;
	Declare str varchar(255);
	Set idDelete = pemp_no;
	Set theCounter = amount;
	set str = '';


	
	Deleter: LOOP
		if theCounter <= 0 then
			leave Deleter;
		end if;
	Set str = Concat(str, idDelete, ',');
	delete from employees where emp_no = idDelete;
	set theCounter = theCounter - 1;
	set idDelete = idDelete - 1;
	end loop;

	select str as 'Deleted Rows:';
	
	
	
end //

delimiter ;

delimiter //

create procedure yearbonus(
	in pemp_no int(11)
	
)

begin
	
	declare curSalary int(11) default 0;
	declare theBonus int(11);
	declare theDate DATE;
	declare str varchar(255);
	set str = '';

	set theBonus = 0;
	
	

	Select salary
	into curSalary
	from salaries
	where emp_no = pemp_no and to_date > curdate();

	select from_date
	into theDate
	from salaries
	where emp_no = pemp_no and to_date > curdate();

	if theDate < '1990-01-01' then
		set theBonus = 20000;
	elseif theDate < '2000-01-01' then
		set theBonus = 15000;
	elseif theDate < '2010-01-01' then
		set theBonus = 10000;
	elseif theDate < '2015-01-01' then
		set theBonus = 5000;
	end if;

	set str = concat('Employee Number: ', pemp_no,' would recieve a $', theBonus,' on top of their $', curSalary,' salary.');

	select str as 'Will they receive a bonus:';

end //

delimiter ;




delimiter //

create procedure lifetimeaveragesalary(
	in pemp_no int(11)

)
begin
		declare avgsalary int(11);
		declare str varchar(255);
		
		select avg(salary)
		into avgsalary
		from salaries
		where emp_no = pemp_no;
	
		set str = concat(pemp_no,' has had a lifetime average salary of: $', avgsalary);
	
		select str as 'Results:';
	
		
	
	

end //

delimiter ;

delimiter //

create procedure amountcurrentlyindepartment(
	in department varchar(15)
	

)
begin
	
	declare str varchar(255);
	set str = department;

	select d.dept_name as "Department name:", count(s.emp_no) as "Amount currently working in department:" from departments d
	inner join dept_emp de on d.dept_no = de.dept_no
	inner join salaries s on s.emp_no = de.emp_no
	where s.to_date > curdate()
	group by d.dept_name
	having d.dept_name = str;

end //

delimiter ;
	
	

	
		







	