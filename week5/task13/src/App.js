import React from 'react';
import './App.css';
import { books, courses, blogs } from './Data';

function App() {
  const showBooks = true;
  const showBlogs = true;
  const showCourses = true;

  let bookdet = null;
  if (showBooks) {
    bookdet = (
      <ul>
        {}
        {books.map((book) =>
          <div key={book.id}>
            <h3>{book.bname}</h3>
            <h4>{book.price}</h4>
          </div>
        )}
      </ul>
    );
  }

  const content = showBlogs && (
    <ul>
      {blogs.map((blog) =>
        <div key={blog.id}>
          <h2>{blog.title}</h2>
          <h4>{blog.author}</h4>
          <p>{blog.snippet}</p>
        </div>
      )}
    </ul>
  );

  const coursedet = showCourses ? (
    <ul>
      {courses.map((course) =>
        <div key={course.id}>
          <h2>{course.name}</h2>
          <h4>{course.date}</h4>
        </div>
      )}
    </ul>
  ) : <p>No courses available</p>;

  return (
    <div className="container">
        
      <div className="mystyle1">
        <h1>Course Details</h1>
        {coursedet}
      </div>

      <div className="v1">
        <h1>Book Details</h1>
        {bookdet}
      </div>

      <div className="st2">
        <h1>Blog Details</h1>
        {content}
      </div>

    </div>
  );
}

export default App;