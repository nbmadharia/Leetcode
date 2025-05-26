CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN

    declare offset_val INT;
    set offset_val= N - 1;
  RETURN (
      select distinct salary 
      from Employee order by salary desc 
      LIMIT 1 OFFSET offset_val

  );
END