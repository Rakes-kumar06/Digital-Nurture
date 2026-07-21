import React, { Component } from 'react';

export class CurrencyConvertor extends Component {
    constructor(props) {
        super(props);
        this.state = { amount: '' };
        // Using 'this' keyword to bind the event handler
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    // Handle the Click event of the button to invoke the handleSubmit event
    handleSubmit(e) {
        e.preventDefault(); // Prevents the page from refreshing
        alert("Converting to Euro Amount is " + (this.state.amount * 80));
    }

    render() {
        return (
            <div>
                <h1 style={{color: 'green'}}>Currency Convertor!!!</h1>
                <form onSubmit={this.handleSubmit}>
                    <label>Amount: </label>
                    <input 
                        type="number" 
                        value={this.state.amount} 
                        onChange={(e) => this.setState({amount: e.target.value})} 
                    />
                    <br/><br/>
                    <label>Currency: </label>
                    <textarea value="Euro" readOnly></textarea>
                    <br/><br/>
                    <button type="submit">Submit</button>
                </form>
            </div>
        );
    }
}