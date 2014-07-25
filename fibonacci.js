function createFibonacci(limit) {
	var a = 0, b = 1, seq = [0 , 1], num = 0, nextNum;

	while(num < limit) {
		nextNum = a + b;
		seq.push(nextNum);
		a = b;
		b = nextNum;
		num++;
	}

	console.log(seq);
}