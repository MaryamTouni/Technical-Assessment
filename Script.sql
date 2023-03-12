select u.user_id , username, training_id , training_date, count(training_id) as tcount from 
User u LEFT JOIN Training_details td on u.user_id = td.user_id
group by u.user_id , u.username , td.training_id , td.training_date
having tcount>1
order by td.training_date desc