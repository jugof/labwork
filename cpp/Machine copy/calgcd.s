	.include "common.i"

	.extern GCD

	.entry run
run:
	GetInt	ask
	mov	rdi,rax
 
	GetInt	ask
	mov	rsi, rax
	call	GCD
	PutInt  tell
	ret

ask:	.string "Positive Integer: "
tell:	.string "G.C.D = "

	.end



