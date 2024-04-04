	.include "common.i"
	.extern GCD
	.entry Run

Run:	GetInt	Num
	mov	rdi, rax
	GetInt	Num
	mov 	rsi, rax

	call	GCD
	
	PutInt	Tell
	ret

Num:	.string "Enter the Num: "
Tell:	.string "GCD is: "

	.end
