import React from 'react';
import './App.css'; // Import our CSS classes

function App() {
  // 1. Create an element to display the heading[cite: 5]
  const element = "Office Space";
  
  // 2. Attribute to display the image of the office space[cite: 5]
  const sr = "https://images.unsplash.com/photo-1497366216548-37526070297c?auto=format&fit=crop&w=400&q=80";
  const jsxatt = <img src={sr} width="25%" height="25%" alt="Office Space" />;
  
  // 3. Create an object of office to display the details like Name, Rent and Address[cite: 5]
  const ItemName = { Name: "DBS", Rent: 50000, Address: 'Chennai' };
  
  // 4. Apply CSS conditionally based on the Rent value[cite: 5]
  let colors = [];
  if (ItemName.Rent <= 60000) {
      colors.push('textRed'); // Red if below 60000[cite: 5]
  } else {
      colors.push('textGreen'); // Green if above 60000[cite: 5]
  }

  // Render the JSX to the DOM[cite: 5]
  return (
    <div style={{ padding: '20px' }}>
      <h1>{element}, at Affordable Range</h1>
      
      {}
      {jsxatt}
      
      {}
      <h1>Name: {ItemName.Name}</h1>
      <h3 className={colors.join(' ')}>Rent: Rs. {ItemName.Rent}</h3>
      <h3>Address: {ItemName.Address}</h3>
    </div>
  );
}

export default App;