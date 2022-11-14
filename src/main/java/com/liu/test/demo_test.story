Scenario: scenario1
Given there are <oldNum> persons 
When <leaveNum> persons leave
Then <currentNum> is result
Examples: 	| oldNum | leaveNum | currentNum |
			|  3 	 | 2 		| 1 		 |
			|  9 	 | 3 		| 6 		 |
			| 10 	 | 7 		| 3 		 |

Scenario: scenario2
Given xiaoming's salary is 100 RMB
When workday is 2
Then result is 200




