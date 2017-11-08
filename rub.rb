def fib(iteration)
  if (iteration == 0 || iteration == 1)
    1
  else
    fib(iteration - 1) + fib(iteration - 2)
  end
end

(1..45).each do |i|
  puts "#{i} => #{fib(i)}"
end
