import React from 'react';

// Component for logged-in users
export function UserGreeting(props) {
    return <h1>Welcome back</h1>;
}

// Component for guest users
export function GuestGreeting(props) {
    return <h1>Please sign up.</h1>;
}

// Main Greeting component that decides which one to show[cite: 7]
export function Greeting(props) {
    const isLoggedIn = props.isLoggedIn;
    
    // Conditional rendering based on the prop[cite: 7]
    if (isLoggedIn) {
        return <UserGreeting />;
    }
    return <GuestGreeting />;
}