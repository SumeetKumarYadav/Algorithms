#http://www.spoj.com/problems/TOTLA/

N = Integer(gets.chomp())
  
for n in (0...N)
  @input = gets.chomp()
  puts @input.scan(/t/i).count
end