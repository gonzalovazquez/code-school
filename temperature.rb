def to_farhenheit temp
	result =  (temp.to_f * 9) / 5 + 32
	return result.to_s + 'F'	
end

def to_celcius temp
	result =  (temp.to_f - 32) * 5 / 9;
	return result.to_s + 'C'
end

puts to_farhenheit 25
puts to_celcius 100