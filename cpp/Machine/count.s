	.include "common.i"
        .entry run
run:
        GetInt askn
	mov rcx, rax
	add rax, 1
	mul rcx
	mov rcx, 2
	div rcx	 
        PutInt Tell 
	ret

askn: 	.string "Enter the N: "

Tell: 	.string "Sum of integers: "
	.end

