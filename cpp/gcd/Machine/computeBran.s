	.include "common.i"
	.entry run

run:
	GetInt	askl
	mov	rsi, rax
	GetInt	asku
	mov	rdi,rax
	cmp	rsi, rdi
	jg 	done

	mov	rax, rsi
	sub	rax,1
	call	compute
	mov	rbx, rax

	mov	rax, rdi
	call 	compute	
	sub	rax, rbx

	PutInt tell
done:	ret

compute:
	mov	rcx, rax
	add	rax,1
	mul	rcx
	shr	rax,1
	ret

askl:	.string "lower limit: "
asku:	.string "upper limit: "
tell:	.string "sum of integers: "
	.end


