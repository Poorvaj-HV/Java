select max(num) num
from mynumbers
where num in (
    select max(num)
    from mynumbers
    group by num
    having count(num) = 1
);