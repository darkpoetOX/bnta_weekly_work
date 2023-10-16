const {sum} = require('./calculator'); //specifies the function we are importing and the path it's in.

describe('addition functionality', () => {

test('can add two small positive numbers', () => {
    // Arrange
    const expected = 5;
    // Act
    const actual = sum(2, 3);
    // Assert
    expect(actual).toBe(expected);
})

test('can add two small negative numbers', () => {
    const expected = -5;
    const actual = sum(-2, -3);
    expect(actual).toBe(expected); 
})

})