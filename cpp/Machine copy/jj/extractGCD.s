	.include "common.i"

	.extern GCD

	.entry Run

Run:	GetInt	num
	mov	rdi, rax
	GetInt	num
	mov	rsi, rax
	call GCD
	PutInt tell
	ret

num:	.string "Enter the value of Num: "
tell:	.string "GCD is: "

	.end

