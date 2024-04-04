	.include "common.i"
        .entry run
run:
         GetInt	askl
         mov	rsi,rax
	 GetInt asku
		
	 mov 	rdi,rax
	 cmp   rsi, rdi
	 jge done	
	
         mov    rax,rsi
    	 sub    rax,1
	 mov	rcx,rax
	 add	rax,1
	 mul    rcx
	 mov	rcx,2
	 div    rcx
	 mov	rbx, rax
	 mov	rax, rdi
	 mov    rcx, rdi
	 add 	rcx,1
	 mul 	rcx
	 mov 	rcx,2
	 div 	rcx
	 sub	rax,rbx
	PutInt	Tell
	
done:	ret

askl: 	.string "Enter the lower: "
asku:   .string "Enter the upper: "
Tell: 	.string "Sum of integers: "
	.end

