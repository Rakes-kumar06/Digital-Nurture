import React from 'react';
import Post from './Post';

class Posts extends React.Component {
    constructor(props) {
        super(props);
        // Initialize the component state with an empty list of posts
        this.state = {
            posts: []
        };
    }

    loadPosts() {
        fetch('https://jsonplaceholder.typicode.com/posts')
            .then(response => response.json())
            .then(data => {
                const fetchedPosts = data.slice(0, 5).map(item => new Post(item.id, item.title, item.body));
                this.setState({ posts: fetchedPosts });
            })
            .catch(error => {
                throw new Error("Failed to fetch posts!");
            });
    }

    componentDidMount() {
        this.loadPosts();
    }

    // Life cycle hook: Responsible for displaying any error as an alert message
    componentDidCatch(error, info) {
        alert("An error occurred in the component: " + error.message);
    }

    render() {
        return (
            <div>
                <h1>Latest Blog Posts</h1>
                <hr />
                {this.state.posts.map(post => (
                    <div key={post.id}>
                        <h3>{post.title}</h3>
                        <p>{post.body}</p>
                    </div>
                ))}
            </div>
        );
    }
}

export default Posts;