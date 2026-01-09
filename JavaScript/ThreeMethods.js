const students = [
  { name: "Smith", marks: 80 },
  { name: "Jenny", marks: 55 },
  { name: "John", marks: 35 }
];

const totalMarks = students
  .map(student => {
    if (student.marks < 60) {
      return { ...student, marks: student.marks + 20 };
    }
    return student;
  })
  .filter(student => student.marks > 60)
  .reduce((sum, student) => sum + student.marks, 0);

console.log(totalMarks);