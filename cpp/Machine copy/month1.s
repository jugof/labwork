	.include "common.i"
	.entry run

run:
	GetInt askd
	mov	rdi, rax
	sub	rdi, 1
	mov	rbx, offset week
	mov	rax, [rbx+8*rdi]
	call	Compute
	PutInt	tell

done:	ret

Compute: 
	mov	rcx, rax
	add	rax, 1
	mul	rcx
	shr	rax, 1
	ret

askd:	.string	"days [1 - 7]: "
tell:	.string "Total Amount= "
week:	.quad 1, 2, 3, 4, 5, 6, 7
	.end


