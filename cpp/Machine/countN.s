	.include "common.i"
        .entry run
run:
         GetInt	asku
         mov	rcx,3
         mul	rcx
	PutInt	Tell
	
	ret

asku: 	.string "Enter the N: "
Tell: 	.string "Sum of integers: "
	.end

