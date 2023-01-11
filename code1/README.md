A cold storage company has N storage units for various products.
The company has received N orders that must be preserved at respective
IN temperatures inside the storage units. The company manager wishes to identify which products must be preserved at negative temperatures
Write an algorithm to help the manager find the number of products that have negative
Lemperature storage requirements.

<h3>Input</h3>
The first line of the input consists of an integer numOfProducts,
representing the number of products(N).<br/>
The second line consists of N space-separated integers - temperature0, temperature1,... temperatureN-1.<br/>
representing the temperatures at which the products must be preserved in the storage units.

<h3>Output</h3>
Print an integer representing the number of products that must be preserved at negative temperatures.

<h3>Example</h3>
<h3>Input:</h3>
7
9-3 8-6-7 8 10
<h3>Output:</h3>
3
<h3>Explanation:</h3>
The products that must be preserved at negative temperatures are at indices [1,3,4] i.e. [-3, -6, -7].
So, the output is 3.
