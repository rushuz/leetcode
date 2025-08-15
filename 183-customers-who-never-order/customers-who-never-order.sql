select a.name as Customers from Customers as a
where a.Id not in (select b.customerId from Orders b)
