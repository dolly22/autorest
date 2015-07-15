namespace Fixtures.SwaggerBatUrl
{
    using System;
    using System.Collections.Generic;
    using System.Net.Http;
    using System.Threading;
    using System.Threading.Tasks;
    using Newtonsoft.Json;
    using Microsoft.Rest;
    using Models;

    /// <summary>
    /// Test Infrastructure for AutoRest
    /// </summary>
    public partial interface IAutoRestUrlTestService
    {
        /// <summary>
        /// The base URI of the service.
        /// </summary>
        Uri BaseUri { get; set; }

        /// <summary>
        /// Gets or sets json serialization settings.
        /// </summary>
        JsonSerializerSettings SerializationSettings { get; }

        /// <summary>
        /// Gets or sets json deserialization settings.
        /// </summary>
        JsonSerializerSettings DeserializationSettings { get; }        

        /// <summary>
        /// A string value 'globalItemStringPath' that appears in the path
        /// </summary>
        string GlobalStringPath { get; set; }

        /// <summary>
        /// should contain value null
        /// </summary>
        string GlobalStringQuery { get; set; }


        IPaths Paths { get; }

        IQueries Queries { get; }

        IPathItems PathItems { get; }

    }
}
