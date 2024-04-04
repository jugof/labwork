	.intel_syntax noprefix
	.text
	.global GCD

GCD:
1:	cmp	rdi, rsi
	je	3f
	jl	2f
	sub	rsi, rdi
	jmp	1b
2:	sub	rdi, rsi
	jl 	1b
3:	mov	rax, rsi
	ret
	.end
	
	
