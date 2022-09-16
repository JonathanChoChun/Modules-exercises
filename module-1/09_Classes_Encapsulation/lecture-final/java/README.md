## Sample Exercises

### Step One: Implement the `Person` class

#### Instance variables

| Attribute               | Data Type | Get | Set | Description                                                             |
| ----------------------- | --------- | --- | --- | ----------------------------------------------------------------------- |
| earnedMarks             | int       | X   | X   | The total number of correct marks submitter received on the assignment. |
| possibleMarks           | int       | X   |     | The number of possible marks on the assignment.                         |
| submitterName           | String    | X   |     | The submitter's name for the assignment.                                |
| letterGrade _(derived)_ | String    | X   |     | The letter grade for the assignment.                                    |

**Notes**

- `letterGrade` is a derived attribute that's calculated using `earnedMarks` and `possibleMarks`:
    - For 90% or greater, it returns "A"
    - For 80-89%, it returns "B"
    - For 70-79%, it returns "C"
    - For 60-69%, it returns "D"
    - Otherwise, it returns "F"
    - _hint_: `possibleMarks` and `earnedMarks` are `int`s. What happens when a smaller integer is divided by a larger integer?

#### Constructor

The `HomeworkAssignment` class has a single constructor. It accepts two arguments: `int possibleMarks` and `String submitterName`. Use these parameters to set the instance variables of the class.

