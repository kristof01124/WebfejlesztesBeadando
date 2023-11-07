import './crud.css'
import CRUDTable,
    * as reactCrudTable from 'react-crud-table';
import { SiteUserController } from '../controller/siteUserController';
import { Link } from 'react-router-dom';


const DescriptionRenderer = ({ field }) => <textarea {...field} />;


const styles = {
    container: { margin: 'auto', width: 'fit-content' },
};

export function SiteUserView() {
    return (
        <div style={styles.container}>
            <Link to="/orders">Orders</Link>
            <CRUDTable
                caption="Site users"
                fetchItems={() => SiteUserController.getAll()}
            >
                <reactCrudTable.Fields>
                    <reactCrudTable.Field
                        name="userId"
                        label="Id"
                        hideInCreateForm
                        readOnly
                    />
                    <reactCrudTable.Field
                        name="firstName"
                        label="First Name"
                        placeholder="name"
                    />
                    <reactCrudTable.Field
                        name="lastName"
                        label="Last Name"
                        placeholder="name"
                    />
                    <reactCrudTable.Field
                        name="username"
                        label="Username"
                        placeholder="Username"
                    />
                    <reactCrudTable.Field
                        name="password"
                        label="Password"
                        placeholder="Password"
                    />
                </reactCrudTable.Fields>
                <reactCrudTable.CreateForm
                    title="User Creation"
                    message="Create a new user!"
                    trigger="Create new user!"
                    onSubmit={SiteUserController.createSiteUser}
                    submitText="Create"
                />

                <reactCrudTable.UpdateForm
                    title="Task Update Process"
                    message="Update task"
                    trigger="Update"
                    onSubmit={SiteUserController.updateSiteUser}
                    submitText="Update"
                />

                <reactCrudTable.DeleteForm
                    title="Task Delete Process"
                    message="Are you sure you want to delete the task?"
                    trigger="Delete"
                    onSubmit={SiteUserController.deleteSiteUser}
                    submitText="Delete"
                />
            </CRUDTable>
        </div>
    );
}